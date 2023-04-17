import {BrowserRouter as Router, Routes, Route} from 'react-router-dom'

/*

import Contato from './components/pages/Contato';
import Empresa from './components/pages/Empresa';
import NovoProjeto from './components/pages/NovoProjeto';
import Projeto from './components/pages/Projeto';




import Project from './components/pages/Project';
*/

import Container from './components/layout/Container';
import Footer from './components/layout/Footer';
import Navbar from './components/layout/Navbar';
import Home from './components/pages/Home';




function App() {
  return (
    <Router>

      <Navbar/>

      <Container customClass='minHeight'>
        <Routes>
          <Route exact path="/" element={<Home/>} ></Route>
          <Route path="/registro" ></Route>
          
        </Routes>
        
      </Container>
      
      <Footer/>
    
    </Router>
    
  );
}

export default App;
