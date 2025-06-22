import { Outlet, Link } from "react-router-dom";


const Layout = () => {

    return (
        <><div id="headerDiv">
            <header>
                <h1><span>Book </span><span>Tracking</span></h1>
            </header>
            <nav id="menuBar">
                <Link to="/layout/home" className="navLinks">Home</Link>
                <Link to="/layout/myBooks" className="navLinks">My books</Link>
                <Link to="/layout/about" className="navLinks">About</Link>
            </nav>
            </div>
            <main className="content">
        <Outlet />
      </main>
        </>
    )
}

export default Layout