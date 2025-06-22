import './App.css'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Layout from './Layout';
import Home from "./pages/Home";
import About from "./pages/About";
import MyBooks from "./pages/MyBooks";
import Splash from "./pages/Splash";

function App() {

  return (
    <>
      <Router>
        <Routes>        
          <Route path="/" element={<Splash />}></Route>  
          <Route path="layout" element={<Layout />}>
            <Route path="home" element={<Home />}></Route>
            <Route path="myBooks" element={<MyBooks />}></Route>
            <Route path="about" element={<About />}></Route>
          </Route>
        </Routes>
      </Router>
      
    </>
    
  )
}

export default App
