// // import Counter from "./Counter";
// // import ErrorBoundary from './ErrorBoundary';
// // import PasswordGenerator from "./PasswordGenerator";

// // import DemoCallBack from "./Day20/prevCnt";
// // import DemoWithCallBack from "./Day20/PrevWithCall";
// // import Test1 from "./Day20/UseContext";

// import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
// import Home from './Components/Home';
// import AboutUs from './Components/AboutUs';
// import Contact from './Components/Contact';

// export default function App() {



//     return (
//         <>
//             {/* <ErrorBoundary>
//                 <Counter></Counter>
//             </ErrorBoundary> */}
//             {/* <PasswordGenerator></PasswordGenerator> */}

//             {/* <DemoCallBack></DemoCallBack>
//             <DemoWithCallBack></DemoWithCallBack> */}

//             {/* <Test1/> */}


//         </>

        
//     )
// }


import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Components/Home';
import AboutUs from './Components/AboutUs';
import Contact from './Components/Contact';

function App() {
  return (
    <Router>
      <div>
        <nav>
          <ul style={{ display: 'flex', gap: '20px', listStyle: 'none' }}>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/about">About Us</Link></li>
            <li><Link to="/contact">Contact</Link></li>
          </ul>
        </nav>

        <hr />

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/contact" element={<Contact />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
