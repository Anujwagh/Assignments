import { useState } from 'react';

function TextInputList() {
  const [inputValue, setInputValue] = useState('');
  const [listItems, setListItems] = useState([]);

  const handleBlur = () => {
    if (inputValue.trim() !== '') {
      setListItems(prev => [...prev, inputValue.trim()]);
      setInputValue('');
    }
  };

  return (
    <div>
      <h3>Enter Item:</h3>
      <input
        type="text"
        value={inputValue}
        onChange={e => setInputValue(e.target.value)}
        onBlur={handleBlur}
        placeholder="Type something and click away"
      />

      {listItems.length > 0 && (
        <ol style={{ marginTop: '20px' }}>
          {listItems.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ol>
      )}
    </div>
  );
}

export default TextInputList;
