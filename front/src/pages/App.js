import React, { Component } from 'react';
import './App.css';
import Home from './home/Home';
import Finalizacao from './finalizacao/Finalizacao';
import Tamanho from './tamanho/Tamanho';
import Sabor from './sabor/Sabor';
import ListagemPedidos from './listagem-pedidos/ListagemPedidos';
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import CustonHeader from '../components/custon-header/CustonHeader';
import CustomButtonPrimay from '../components/custon-button-primary/CustomButtonPrimary';

class App extends Component {
  render() {
    return (
      <div>
        <CustonHeader></CustonHeader>
        <BrowserRouter>
          <Switch>
            <Route path="/" exact={true} component={Home} />
            <Route path="/tamanho" exact={true} component={Tamanho} />
            <Route path="/sabor" exact={true} component={Sabor} />
            <Route path="/finalizacao" exact={true} component={Finalizacao} />
            <Route path="/pedidos" exact={true} component={ListagemPedidos} />
          </Switch>
        </BrowserRouter>
        <CustomButtonPrimay></CustomButtonPrimay>
      </div>
    );
  }
}

export default App;
