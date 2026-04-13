#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        printf("Je suis le processus fils\n");
        printf("PID fils = %d\n", getpid());
        printf("PPID fils = %d\n", getppid());
    } else {
        printf("Je suis le processus père\n");
        printf("PID père = %d\n", getpid());
    }
    return 0;
}
