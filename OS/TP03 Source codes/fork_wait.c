#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        printf("Fils : PID=%d\n", getpid());
    } else {
        wait(NULL);
        printf("Père : PID=%d\n", getpid());
    }
    return 0;
}
