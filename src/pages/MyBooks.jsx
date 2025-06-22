import { useEffect, useState } from 'react';
import Book from '../components/Book'; 

const MyBooks = () => {
  const [myBooks, setMyBooks] = useState([]);

  useEffect(() => {
    const fetchMyBooks = async () => {
      try {
        const response = await fetch("http://localhost:8080/books/myBooks", {
          credentials: "include"
        });

        const result = await response.json();

        const formattedData = result.map(book => ({
          id: book.id,
          title: book.title,
          author: book.author,
          description: book.description,
          image: book.imageUrl,
          isStarred: book.myBooks
        }));

        setMyBooks(formattedData);
      } catch (error) {
        console.error("Error fetching myBooks:", error);
      }
    };

    fetchMyBooks();
  }, []);

  return (
    <>
      <h2 style={{color:"rgb(0, 103, 238)"} }>My Books</h2>
      <div id="bookContainer">
        {myBooks.length === 0 ? (
          <p>No books marked as read yet.</p>
        ) :
          (
            myBooks.map(book => (
              <Book key={book.id} data={book} onToggleFavorite={() => { }} />//Η ΝΑ ΓΡΑΨΩ ΑΛΛΗ ΣΥΝΑΡΤΗΣΗ Η ΝΑ ΤΡΟΠΟΠΟΙΗΣΩ ΑΥΤΗΝ ΠΟΥ ΕΧΩ
              //ΓΙΑΤΙ ΤΩΡΑ ΔΔΕΝ ΜΠΟΡΩ ΝΑ ΒΓΣΛΩ ΤΑ ΒΙΒΛΙΑ ΑΠΟ ΤΑ ΑΓΑΠΗΜΕΝΑ
            ))
          )}
      </div>
    </>

  );
};

export default MyBooks;
