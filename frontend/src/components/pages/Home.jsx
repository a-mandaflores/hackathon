import React from 'react'
import LinkButton from '../layout/LinkButton'
import styles from './Home.module.css'


const Home = () => {
  return (
    <section className={styles.home_container}>
       <div className={styles.home_div}></div>
       <LinkButton to="/nivelamento" text='Iniciar Nivelamento' />
    </section>
  )
}

export default Home