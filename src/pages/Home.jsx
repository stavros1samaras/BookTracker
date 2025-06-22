
import { useEffect, useState } from 'react';
import book from '../assets/book.jpg';
import effortless from '../assets/effortless.jpg';
import the7 from '../assets/the7.jpg';
import Book from '../components/Book.jsx';
import temp from '../assets/temp11.jpg';
import { useNavigate } from "react-router-dom";
import "../modules/Home.css"
import mainImg from '../assets/mainImag.jpg';


const Home = () => {

  const [books, setBooks] = useState([]);
  //const navigate = useNavigate(); ΔΕΒ ΘΥΜΑΜΑΙ ΓΙΑΤΙ ΤΟ ΕΙΧΑ ΒΑΛΕΙ ΘΑ ΤΟ ΒΓΑΛΩ

  useEffect(() => {

    const getData = async () => {
      try {
        const response = await fetch("http://localhost:8080/books/all", {
          credentials: "include" // για το κονφιγκ
        });
        const result = await response.json();
        const formattedData = result.map(book => (
          {
            id: book.id,
            title: book.title,
            author: book.author,
            description: book.description,
            image: book.imageUrl,
            isStarred: book.myBooks
          }
        ))
        console.log("Books fetched:", formattedData); // και αυτο θα το βγαλω το κραταω για τεστινγκ τωρα
        setBooks(formattedData);
      }
      catch (error) {
        console.log("Error getting Books: " + error)
      }
    }
    getData();

  }, []);

  const onToggleFavorite = (book) => {
    console.log("Clicked:", book);

    if (!book.isStarred) {
      fetch("http://localhost:8080/books/addToFav", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        credentials: "include",
        body: JSON.stringify(book)  // εδω στελνω ολο το αντικειμενο
        //καλα θα ηταν να στελνω μονο το id του αρα πρεπει να αλλαξω το μπακεντ
      })
        .then(response => {
          if (!response.ok) {
            throw new Error("Failed to add to favorites");
          }

          setBooks(prevBooks =>
            prevBooks.map(b =>
              b.id === book.id ? { ...b, isStarred: true } : b
            )
          );
        })
        .catch(error => {
          console.error("Error adding to favorites:", error);
        });
      console.log("Sending book:", book);
    }
  };

  return (
    <>
      <div id="temp">
        <article id="intro">
          <div id="slogan">
            <h2 className='intro'>Track your reads. Discover your journey.</h2>
            <h2 className='intro'>Browse all available books, mark the ones you've read, and build your personal reading archive.</h2>
            <p id='sloganP'>With this app, you can explore a collection of books, mark the ones you've read, and keep track of your reading progress. Simple, personal, and always up to date.</p>
          </div>
          <img id="mainImg2" src={mainImg} alt="" />
        </article>
      </div>
      <div id="bookContainer">
        {books.map(book => (
          <Book key={book.id} data={book} onToggleFavorite={onToggleFavorite} />
        ))}
      </div>
    </>
  )








}

export default Home