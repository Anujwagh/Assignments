import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import UseRef from './hooks/UseRef';
import Table from './Table';
import PasswordGenerator from './PasswordGenerator';
import LoginForm from './LoginForm';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <UseRef/> */}
    <Table/>
    {/* <PasswordGenerator/> */}
    {/* <LoginForm/> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
Table();
