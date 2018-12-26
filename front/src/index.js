import React from 'react';
import { ReactDOM, render } from 'react-dom';
//import './index.css';
import App from './components/App';
import { BrowserRouter, Switch, Route } from 'react-router-dom'
import * as serviceWorker from './serviceWorker';
import Home from './components/home/Home';
import Finalizacao from './components/finalizacao/Finalizacao';
import Tamanho from './components/tamanho/Tamanho';
import Sabor from './components/sabor/Sabor';
import ListagemPedidos from './components/listagem-pedidos/ListagemPedidos';

//render(<App />, document.getElementById('root'));

render((
    <BrowserRouter>
        <Switch>
            <Route path="/" exact={true} component={Home} />
            <Route path="/tamanho" exact={true} component={Tamanho} />
            <Route path="/sabor" exact={true} component={Sabor} />
            <Route path="/finalizacao" exact={true} component={Finalizacao} />
            <Route path="/pedidos" exact={true} component={ListagemPedidos} />
        </Switch>
    </BrowserRouter>
), document.getElementById('root'));
// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
