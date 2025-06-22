import { Link } from "react-router-dom";
import "../modules/Splash.css"
import temp from '../assets/temp11.jpg';

const Splash = () => {
    return (
    <>
      <div id="splashContainer">
        <img src={temp} alt="" id="mainImg" />
        <div id="content">
          <h1>Welcome to Book Tracking App</h1>
          <h2 id="splashH2">Track the books you've read — with the power of simplicity.</h2>
          <Link to="/layout/home">
        <button id="splashButton">Track your books</button>
      </Link>
        </div>
      </div>
    </>
  );
};

export default Splash;