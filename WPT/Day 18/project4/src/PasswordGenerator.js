import React, { useState } from 'react';

function PasswordGenerator() {
  const [length, setLength] = useState(8);
  const [password, setPassword] = useState('');

  const generatePassword = () => {
    const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+';
    let newPassword = '';
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * chars.length);
      newPassword += chars[randomIndex];
    }
    setPassword(newPassword);
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>Random Password Generator</h2>
      <label>
        Password Length:
        <input
          type="number"
          value={length}
          onChange={(e) => setLength(Number(e.target.value))}
          min="4"
          max="32"
          style={{ marginLeft: '10px' }}
        />
      </label>
      <br /><br />
      <button onClick={generatePassword}>Generate Password</button>
      <br /><br />
      {password && (
        <div>
          <strong>Generated Password:</strong>
          <p style={{ fontSize: '18px', color: 'green' }}>{password}</p>
        </div>
      )}
    </div>
  );
}

export default PasswordGenerator;
