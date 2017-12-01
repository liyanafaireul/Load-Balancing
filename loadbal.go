package main

import "net"
import "fmt"
import "bufio"
import "os"
import "strings" // only needed below for sample processing

func main() {


  // listen on all interfaces
  ln, _ := net.Listen("tcp", ":8081")

  // accept connection on port
  conn, _ := ln.Accept()

  // run loop forever (or until ctrl-c)
  for {
    // will listen for message to process ending in newline (\n)
    status, _ := bufio.NewReader(conn).ReadString('\n')

  if strings.EqualFold(status, "single")
  {
    conn1, _ := net.Dial("tcp", "192.168.13.128:8082")
    // send to socket
    fmt.Fprintf(conn1, status + "\n")
  }

  else if strings.EqualFold(status, "married")
  {
   conn2, _ := net.Dial("tcp", "192.168.13.131:8083")
    // send to socket
    fmt.Fprintf(conn2, status + "\n")
  }


  }
}
//end of code
