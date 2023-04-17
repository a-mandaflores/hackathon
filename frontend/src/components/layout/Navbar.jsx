import {Link} from 'react-router-dom'

import Container from './Container'

import styles from './Navbar.module.css'

function Navbar(){
    return(
        <nav className={styles.navbar}>
            <Container>
                <h1 className={styles.logo}>My <br/> Tutor</h1>
                
                <ul className={styles.list}>
                    <li className={styles.item}>
                        <Link to='/register'>Registrar</Link>
                    </li>
                    <li className={styles.item}>
                        <Link to='/login'>Login</Link>
                    </li>  
                </ul>
            </Container>
        </nav>
    )
}

export default Navbar