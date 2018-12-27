import React, { Component } from 'react';
import './Home.css';
import pizza from '../../imagens/pizza.png';

class Home extends Component {
  render() {
    return (
      <div>
        <div class="conteudo">
          <h1>Texto H1</h1>
          <h2>Texto H2</h2>
          <button>MONTAR MINHA PIZZA</button>
          {/* <img src={pizza} /> */}
        </div>
      </div>
    );
  }
}

export default Home;
