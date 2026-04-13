#include <stdio.h>
#include <unistd.h>
int main() {
pid_t pid = fork();
if (pid > 0) {
printf("Père termine\n");
return 0;
} else {
sleep(10);
printf("Fils : nouveau PPID = %d\n", getppid());
}
return 0;
}
