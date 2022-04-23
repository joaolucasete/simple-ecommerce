import { useEffect, useState } from 'react'

function App() {
  const [message, setMessage] = useState('')


  useEffect(() => {
    fetch('http://localhost:3333/').then(res => res.json()).then(res => setMessage(res.message))
  }, [])

  return (
    <>
      <h2>{message}</h2>
    </>
  )
}

export default App
