/*Required Headers*/
 
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <stdio.h>
#include<string.h>
#include<unistd.h>
 
int main()
{
    
 
    char str[100];
    int listen_fd, comm_fd;
 
    struct sockaddr_in servaddr;

    printf("Launching server......\n");
 
    listen_fd = socket(AF_INET, SOCK_STREAM, 0);
 
    bzero( &servaddr, sizeof(servaddr));
 
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = htons(INADDR_ANY);
    servaddr.sin_port = htons(22345);
 
    bind(listen_fd, (struct sockaddr *) &servaddr, sizeof(servaddr));
 
    listen(listen_fd, 10);
 
    comm_fd = accept(listen_fd, (struct sockaddr*) NULL, NULL);

   
 
  
 
        bzero( str, 100);
 
        read(comm_fd,str,100);
 
        printf("Marital status:  %s",str);
 
        write(comm_fd, str, strlen(str)+1);
 
    
}