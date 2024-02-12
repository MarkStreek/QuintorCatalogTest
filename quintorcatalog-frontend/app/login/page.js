"use client";
import React from 'react';
import { useState } from 'react';

export default function Page() {

  const [data, setData] = useState("");

  // create a function to handle the form submission and make a GET request to the localhost
  function handleSubmit(event) {
    event.preventDefault();
    
    const name = event.target.elements.name.value; // Get the value of the input field with name attribute
    
    fetch(`http://localhost:8080/hello/rest?name=${name}`, {
      method: 'GET',
    })
    .then(response => response.json())
    .then(data => {
      setData(data);
    })
  }

    return(
      <>
      <form 
      className="text-center" 
      onSubmit={handleSubmit}
      ><label>
          Test a REST APIs handleRequest
          </label>
          <br></br>
        <input 
        className="border border-sky-500" 
        type="text" 
        placeholder="name"
        required
        name='name'
        ></input>
        <br></br><br></br>
        <input 
        className="border border-sky-500" 
        type="submit"
        ></input>
      </form>
      <h1>{data}</h1>
      </>
    );
  }