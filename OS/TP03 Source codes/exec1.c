#include <stdio.h>
#include <unistd.h>
int main() {
printf("Avant exec\n");
execl("/bin/ls", "ls", "-l", NULL);
printf("Après exec\n"); // Ne s'affiche pas
return 0;
}
