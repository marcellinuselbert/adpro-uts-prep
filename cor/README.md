# Soal Latihan Chain of Responsibility Pattern

Pada soal latihan ini, Anda diminta untuk mengimplementasikan Chain of Responsibility Pattern dengan benar.

## Requirements

Kalian diminta untuk membuat simulasi "middleware" pada suatu *web framework* yang, hmm... bisa dibilang *oversimplified*.
Ada tiga package yang menyusun simulasi framework ini, yaitu `framework`, `middleware`, dan `endpoints`.

- **Package `framework`** berisi berkas-berkas utama yang menyusun simulasi framework ini:
  - `Request` merupakan kelas yang merepresentasikan *request* dari *user*. `Request` berisikan data user, path yang ingin diakses, dan *query dict* (anggap seperti key/value query di URL).
  - `User` merupakan kelas yang merepresentasikan *user* yang melakukan *request*. `User` berisikan nama user dan role.
  - `Handler`, sesuai namanya, sebagai abstraksi dari objek yang akan memproses *request*.
- **Package `endpoint`** menyimpan *endpoint handler* yang akan membaca *query dict* yang diberikan melalui `Request` dan akan mencetak sesuatu. Kami telah menyediakan contoh endpoint yaitu `HelloWorldEndpoint`.
- **Package `middleware`** nantinya berisikan vaildasi-validasi yang perlu dilakukan sebelum mengakses *endpoint*. Bagian ini kami tidak memberikan contoh, silakan kalian susun sesuai dengan Chain of Responsibility pattern.

Kak, `middleware` itu nanti alurnya gimana ya?
1. Cek apakah path-nya sesuai.
2. Cek apakah user memiliki role yang sesuai. Kalau endpoint kalian tidak perlu validasi role, kalian bisa melewati tahapan ini.
3. Request akan ditangani oleh *endpoint* kalian.

Selain menyusun `middleware`, kalian juga perlu mencobanya dengan membuat `endpoint` kalian sendiri. Contoh `endpoint` sudah kami sediakan yaitu `HelloWorldEndpoint`.

## Cara menjalankan program

1. Jalankan perintah `javac CoRMain.java`
2. Jalankan perintah `java CoRMain`
3. Output akan langsung dicetak oleh program
