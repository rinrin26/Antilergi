# Antilergi
The "Antilergy" application is designed to assist users in managing and understanding their allergies. This application has two main features: search and allergy testing.

## Features

- Search Feature: This search feature allows users to search for information related to allergies. Users can enter allergy-related keywords or terms such as allergy type, symptoms, or treatment. Subsequently, the application displays the relevant search results based on the keywords entered. Users can view articles, explanations, or resources related to the allergies that they are looking for.

- Allergy Test Feature: The allergy test feature allows users to perform allergy tests independently. Users can klick the teh button to start the test. After the klicking button test, the user was directed to answer a series of questions or go through the test methods provided in the application. Based on the user's answers, the application provides results or recommendations regarding the tested allergies.

## Link Document Project: 
- https://heylink.me/Antilergi/

## dependencies for Tflite
```
implementation 'org.tensorflow:tensorflow-lite-metadata:0.1.0'
implementation 'org.tensorflow:tensorflow-lite:2.10.0'
```
## dependencies for Service API
```
  implementation 'com.squareup.retrofit2:retrofit:2.9.0'
  implementation "com.squareup.retrofit2:converter-gson:2.9.0"
  implementation "com.squareup.okhttp3:logging-interceptor:4.9.0"
```
## dependencies for Firebase Auth
```
  implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
  implementation 'com.google.firebase:firebase-auth-ktx:21.0.3'
  implementation("com.google.android.gms:play-services-auth:20.7.0")
  implementation 'com.google.firebase:firebase-database-ktx:20.0.4'
```
 

## Result
| Section     | Screenshoot | Description |
|------------ |-------------| ----------- |
|Splashscreen | ![splashscreen](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/splashscreen.png)| Sebelum masuk atau membuka aplikasi Antilergi maka sistem akan menampilkan halaman splashscreen terlebih dahulu. |
| Login |![login](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/login.png)| Gambar disamping merupakan implementasi sistem untuk tampilan login, Halaman login dari aplikasi Antilergi memiliki desain yang sederhana namun fungsional. Terdapat dua kolom utama: satu untuk memasukkan alamat email pengguna dan yang lainnya untuk kata sandi. Setiap kolom dilengkapi dengan ikon yang relevan untuk memudahkan pengguna mengidentifikasi fungsi dari setiap kolom tersebut. |
|Register|![register](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/register.png)| Gambar disamping ini merupakan tampilan dari implementasi sistem yaitu halaman pendaftaran admin yang diperuntukan untuk mendaftarkan pengguna baru. Halaman "Register" berfungsi sebagai pintu masuk bagi pengguna baru yang ingin menggunakan aplikasi Antilergi, Dengan mendaftar, pengguna mendapatkan akses penuh ke semua fitur aplikasi. Proses pendaftaran yang dirancang dengan baik memastikan bahwa informasi yang diperlukan tersedia dan akun dapat dengan mudah dibuat. |
|Forgot Password|![forgot-password](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/register.png)| Halaman "Forgot Password" berfungsi sebagai solusi bagi pengguna yang lupa dengan kata sandi mereka. Dengan mengikuti instruksi pada halaman ini, pengguna dapat dengan mudah mengatur ulang kata sandi mereka tanpa harus menghubungi dukungan teknis. Halaman ini memastikan bahwa meskipun pengguna lupa dengan kata sandinya, mereka tetap dapat mengakses akun dan semua fitur aplikasi dengan proses yang mudah dan cepat. |
|Login With Google | ![google-login](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/google-login-2.png)| Halaman "Login dengan Google" menyediakan akses cepat dan mudah bagi pengguna yang ingin masuk ke aplikasi Antilergi tanpa perlu mengingat kata sandi tambahan. Ketika user mencoba login menggunakan google maka user akan dibawa ke halaman google sign-in untuk memasukan akun google sebagai metode login yang lebih mudah. |
| Login With Facebook | ![facebook-login](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/facebook-login.png)| Halaman "Login dengan Facebook" menyediakan metode alternatif untuk pengguna yang ingin masuk ke aplikasi Antilergi tanpa harus mengisi detail atau membuat akun baru.Ketika user memilih login dengan facebook maka user akan di arahkan ke halaman login facebook dan mengisi informasi akun dengan benar serta mengikuti autentiksi yang diarahkan oleh google. |
| Home Page | ![home-page](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/home.png)| Pada halaman Home ini ada dua menu utama mendominasi tampilan yaitu: "Test" dan "Search". Menu "Test" ada di section biru dibawah search field ini diperuntukan untuk pengujian alergi, sedangkan menu "Search" dengan type field input serta icon kaca pebesar ini untuk menuju ke halaman pencarian. |
| Search Page | ![search-page](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/search.png)| Halaman Pencarian ini terdapat Kotak pencarian dibagian atas dengan placeholder teks seperti "Cari jenis alergi, gejala, atau informasi lainnya..." yang memberikan petunjuk kepada user tentang bagaimana menggunakan fitur pencarian. Saat user mulai mengetik, aplikasi akan menampilkan data informasi yang terkait secara otomatis berdasarkan kata yang dimasukkan. |
| Search Detail Page | ![search-detail-page](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/search-detail.png)| Gambar dari halaman "Detail Item Pencarian" menampilkan tata letak yang detail dan informatif. Pada bagian atas user dapat melihat judul atau nama alergi yang menjadi fokus pencarian, diikuti oleh informasi yang berkaitan dengan alergi tersebut. |
| Riwayat Test Alergi | ![history](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/history.png)| Gambar dari halaman "Riwayat Test Alergi" menunjukkan tampilan daftar yang berurutan, menggambarkan setiap tes alergi yang telah dijalani oleh user. Setiap entri dalam daftar mungkin menampilkan tanggal tes, jenis alergi yang dideteksi, dan ringkasan gejala yang dilaporkan oleh pengguna saat itu.|
| Page Profile | ![profile](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/profile.png)| Dari gambar halaman "Profile", user dapat melihat tampilan profil yang termasuk foto profil user yang diletakkan di bagian atas tengah halaman. Di bawah foto profil, terdapat informasi dasar seperti nama lengkap pengguna dan alamat email.|
| About Application | ![about-app](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/about.png)| Dari gambar halaman "About Aplikasi", kita dapat melihat tampilan informasi mengenai aplikasi Antilergi. Biasanya, halaman seperti ini menampilkan logo aplikasi di bagian atas, diikuti dengan nama aplikasi dan versi yang saat ini digunakan serta deskripsi singkat tentang aplikasi antilergi.|
| Onboarding Test | ![onboarding-test](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/onboarding.png)| Dari gambar halaman "Onboarding Test Alergi", kita dapat melihat sebuah tampilan awal yang biasanya diberikan kepada pengguna saat mereka pertama kali membuka fitur tes alergi. |
| Question Test | ![question-test](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/question-test.png)| Dalam gambar halaman "Question Test Alergi dengan Pilihan” user dapat melihat box pertanyaan yang juga terdapat beberapa pilihan jawaban yang bisa dipilih oleh user. Pilihan jawaban yang disajikan pada pertanyaan yang diajukan adalah dalam bentuk Ya atau tidak, memungkinkan pengguna untuk memilih satu jawaban yang pasti berdasarkan gejala yang mereka alami. |
| Test Result | ![test-result](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/test-result.png)| Dalam gambar halaman "Hasil Test Alergi", kita disajikan dengan tampilan yang menonjolkan informasi hasil dari test alergi yang telah dilakukan oleh pengguna. pada bagian atas halaman menampilkan ringkasan, misalnya "Hasil Test Alergi Anda" atau "Diagnosis Alergi". |
| Field Validation | ![field-validation](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/validation-field.png) | Gambar disamping merupakan tampilan warning karena input field tidak sesuai dengan format email. |
| Login Failed Popup | ![login-failed-popup](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/login-failed-popup.png) | Merupakan tampilan pop up login gagal karena password salah. |
| Reset Password Success Popup | ![reset-password-success-popup](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/reset-password-success-popup.png) | Gambar disamping adalah popup yang akan muncul ketika proses reset password berhasil. |
| Facebook Authentication Code | ![facebook-authentication-code](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/facebook-authentication-code.png) | Gambar disamping adalah tampilan Autentikasi facebook untuk mengirimkan kode sebagai validasi bahwa akun yang digunakan adalah benar milik user.| 
| Keyword Not Found Popup | ![keyword-not-found-popup](https://github.com/rinrin26/Antilergi/blob/d093c099fbcd98f93a03ab0c7edb3102e6e9bcfa/Screanshot/keyword-not-found-popup.png) | Ketika input keyword tidak sesuai maka akan menampilkan pop up data tidak ditemukan.| 


