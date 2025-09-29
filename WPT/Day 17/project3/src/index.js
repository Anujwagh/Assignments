import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import UseStateHook from './hooks/UseStateHook';
import UseEffect from './hooks/UseEffect';
import CounterTable from './hooks/CounterTable';
import TextInputList from './hooks/TextInputList';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    
    {/* <UseStateHook/> */}
    {/* <UseEffect/> */}
    {/* <CounterTable/> */}
    <TextInputList/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
TextInputList();
