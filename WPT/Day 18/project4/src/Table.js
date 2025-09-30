import React, { useState } from 'react';

function Table() {
  const [data, setData] = useState([]);
  const [showTable, setShowTable] = useState(false);

  const fetchData = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts'); // Replace with your JSON URL
      const jsonData = await response.json();
      setData(jsonData);
      setShowTable(true);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  return (
    <div>
      <button onClick={fetchData}>Load Data</button>

      {showTable && (
        <table border="1" cellPadding="10" style={{ marginTop: '20px' }}>
          <thead>
            <tr>
              <th>ID</th>
              <th>UserID</th>
              <th>Title</th>
              <th>Body</th>
            </tr>
          </thead>
          <tbody>
            {data.map(user => (
              <tr key={user.id}>
                <td>{user.userId}</td>
                <td>{user.id}</td>
                <td>{user.title}</td>
                <td>{user.body}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}

export default Table;
