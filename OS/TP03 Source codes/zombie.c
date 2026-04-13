#include <stdio.h>
#include <unistd.h>
int main() {
pid_t pid = fork();
if (pid == 0) {
printf("Fils terminé\n");
return 0;
} else {
sleep(30); // Le père ne fait pas wait()
}
return 0;
}
