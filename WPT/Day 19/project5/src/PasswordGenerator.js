import { useState, useEffect, useCallback } from "react";

export default function PasswordGenerator() {

    const [password, setPassword] = useState('');
    const [length, setLength] = useState(12);
    const [includeNumbers, setIncludeNumbers] = useState(false);
    const [includeSymbols, setIncludeSymbols] = useState(false);

    const generatorPassword = () => {
        let characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
        if (includeNumbers) characters += '0123456789';
        if (includeSymbols) characters += '!@#$%^&*()_+';

        let newPassword = '';
        for (let i = 0; i < length; i++) {
            newPassword += characters.charAt(
                Math.floor(Math.random() * characters.length));
        }


        setPassword(newPassword);
    };

    useEffect(() => { generatorPassword() },
        [length, includeNumbers, includeSymbols])

    useCallback(() => { generatorPassword() },
        [length, includeNumbers, includeSymbols])

    const copyToClipboard = () => {
        navigator.clipboard.writeText(password);
        alert('Password copied to clipboard!');
    };


    return (
        <>
            <div>
                <h1>Random Password Generator</h1>
                <div>
                    <label>Password Length:</label>
                    <input type="number" onChange={(e) => setLength(parseInt(e.target.value))}  ></input>
                </div>
           

            <div>
                <label>
                    <input
                        type="checkbox"
                        checked={includeNumbers}
                        onChange={() => setIncludeNumbers(!includeNumbers)}
                    />
                    Include Numbers
                </label>
            </div>

            <div>
                <label>
                    <input
                        type="checkbox"
                        checked={includeSymbols}
                        onChange={() => setIncludeSymbols(!includeSymbols)}
                    />
                    Include Sysmbols
                </label>
            </div>
            <button onClick={generatorPassword}>Generate Password</button>
            <div>
                <input type="text" value={password} readOnly />
                <button onClick={copyToClipboard}>Copy</button>
            </div>
             </div>

        </>
    )


} 