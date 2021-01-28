import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './App.css';

function App() {
  const [users, setUsers] = useState(null);

  async function getUsers() {
    try {
      const res = await axios.get('http://localhost:8080/users');
      setUsers(res.data);
    } catch(e) {
      console.error(e);
    }
  }

  useEffect(() => {
    getUsers();
  }, [])

  return (
    <div className="App">
      <header className="App-header">
        {
          users && users.map(user => <User user={ user } />)
        }
      </header>
    </div>
  );
}

function User({ user }) {
  return (
    <div>
      <h1>{ user.username }</h1>
    </div>
  )
}


export default App;
