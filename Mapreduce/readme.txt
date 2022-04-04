Lo script per far partire il programma è "mapreduceGruppo3.sh", basta solo quello per avviare il primo job, ed in cascata si avvierà automaticamente il secondo job una volta terminato il primo.

Avendo realizzato 2 job di mapreduce, abbiamo dovuto scrivere i vari risultati in due cartelle diverse (visto che hadoop ci segnava come cartella già esistente se avessimo utilizzato sempre /output3

Per facilitare l'output, ho anche predisposto uno script chiamato "cat.sh" che effettua il normale cat dei vari risultati di output (avendone 5 ci servivano 5 cat)

Buon testing, gruppo 3!

Tanto per dare un idea dei tempi:
macchina virtuale a 6 core e 10 gb di ram: in media 2 minuti per il primo job, e 21 secondi per il secondo job

Totale 2 minuti e 21 circa.