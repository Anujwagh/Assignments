import { useState , useRef ,useEffect } from 'react';

export default function UseRef(){

    const [inputValue , setInputValue] = useState("");
    const count = useRef(0);

    useEffect(() => {

        count.current +=1; 
    });

    return(
        <>
            <p>Enter in the input field:</p>
            <input type='text' value={inputValue}
                    onChange={(e) => setInputValue(e.target.value)}
             >
            
            </input>

            <h1>Render count: {count.current}</h1>

        </>
    )
}