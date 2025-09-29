import  { useState, useEffect } from 'react';

function CounterTable() {
  const [counter, setCounter] = useState(0);
  const [counterHistory, setCounterHistory] = useState([]);

  // useEffect to update the table when counter changes
  useEffect(() => {
    if (counter > 0) {
      setCounterHistory(prev => [...prev, counter]);
    }
  }, [counter]);

  return (
    <div>
      <h2>Counter: {counter}</h2>
      <button onClick={() => setCounter(counter + 1)}>Increment</button>

      {counterHistory.length > 0 && (
        <table border="1" style={{ marginTop: '20px' }}>
          <thead>
            <tr>
              <th>#</th>
              <th>Counter Value</th>
            </tr>
          </thead>
          <tbody>
            {counterHistory.map((value, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{value}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}

export default CounterTable;
