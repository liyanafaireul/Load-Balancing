package main

import "net"
import "fmt"
import "bufio"
import "os"

func main() {

  // connect to this socket
  conn, _ := net.Dial("tcp", "192.168.50.133:8081")
  for {
    // read in input from stdin
    reader := bufio.NewReader(os.Stdin)
    fmt.Print("Enter marital status: ")
    status, _ := reader.ReadString('\n')
    // send to socket
    fmt.Fprintf(conn, status + "\n")
  }
}
