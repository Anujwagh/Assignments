import { useState } from "react";
//import { createRoot } from "react-dom/client";

export default function UseStateHook() {
    const [color, setColor] = useState("red");

    return (
        <>
            <h1>Color is {color}</h1>

            <button type="button" onClick={() => setColor("blue")}>
                Red
            </button>
        </>

    )
}

// createRoot(document.getElementById('root')).render(
//   <UseStateHook />
// );