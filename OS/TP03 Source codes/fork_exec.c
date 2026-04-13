#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
int main() {
pid_t pid = fork();
if (pid == 0) {
execl("/bin/date", "date", NULL);
} else {
wait(NULL);
printf("Commande terminée\n");
}
return 0;
}
