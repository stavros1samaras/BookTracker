import { useState } from "react";
import "../modules/Book.css"

const Book = ({ data, onToggleFavorite }) => {

    return (
        <div id="divBookCont">
            <img id="bookImg" src={data.image} alt="" />
            <h3>{data.title}</h3>
            <p><strong>Author:</strong> {data.author}</p>
            <p>{data.description}</p>

            <button onClick={() => onToggleFavorite(data)}
                style={{
                    fontSize: "24px",
                    background: "none",
                    border: "none",
                    cursor: "pointer"
                }}
            >
                {data.isStarred ? "⭐" : "☆"}
            </button>

        </div>
    );
}

export default Book;