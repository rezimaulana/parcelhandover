<a name="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<br />
<div align="center">

<h3 align="center">Parcel Handover</h3>

  <p align="center">
    Serah terima barang dari satu driver ke driver lainnya di gudang.
    <br />
    <a href="https://github.com/rezimaulana/parcelhandover/issues">Report Bug</a>
    ·
    <a href="https://github.com/rezimaulana/parcelhandover/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Daftar Isi</summary>
  <ol>
    <li><a href="#deskripsi-project">Deskripsi Project</a></li>
    <li>
      <a href="#spesifikasi-aplikasi">Spesifikasi Aplikasi</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## Deskripsi Project

<p>Projek ini memiliki tujuan untuk memantau dan mencatat secara akurat jumlah barang masuk dan keluar pada gudang logistik.</p>
<p>Sistem ini akan mengumpulkan data yang akan digunakan untuk tiga hal utama:<br> 
1. Melacak kehadiran driver gudang, meliputi waktu kedatangan dan waktu keberangkatan<br>
2. Analisis jumlah paket masuk dan keluar pada gudang<br>
3. Menilai performa sorting berdasarkan tujuan</p>
<p>Informasi ini biasanya dicatat secara manual melalui Excel atau melalui query database yang rumit, dan sulit didapatkan terutama pada industri ekspedisi.</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Spesifikasi Aplikasi

Aplikasi ini dikembangkan menggunakan Framework Spring Boot versi 2.7.4. Spring Boot digunakan agar aplikasi ini akan memiliki performa yang optimal dan mudah digunakan.

### Prerequisites

Berikut adalah daftar tools dan software yang diperlukan untuk menjalankan aplikasi.
* Maven 3.8.6
  ```url
  https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.8.6/apache-maven-3.8.6-bin.zip
  ```
* PostgreSQL 11.18
  ```url
  https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
  ```
* Open JDK 11.0.2
  ```url
  https://jdk.java.net/archive/
  ``` 

### Installation

1. Clone repository
   ```sh
   git clone https://github.com/rezimaulana/parcelhandover.git
   ```
2. Buat database untuk aplikasi
   ```sql
   CREATE DATABASE parcelhandover;
   ```
3. Modifikasi application.properties jika perlu
4. Buka project dan gunakan maven untuk update project
5. Run App.java
6. Table akan terupdate otomatis pada database
7. Data init akan insert otomatis pada tabel
8. http://localhost:5003/swagger-ui/index.html#/

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the GPL-3.0 License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Maulana Rezi Rosadi - [@rezi_maulana](https://twitter.com/rezi_maulana) - rsazrm@gmail.com

Project Link: [https://github.com/rezimaulana/parcelhandover](https://github.com/rezimaulana/parcelhandover)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
[contributors-shield]: https://img.shields.io/github/contributors/rezimaulana/parcelhandover.svg?style=for-the-badge
[contributors-url]: https://github.com/rezimaulana/parcelhandover/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/rezimaulana/parcelhandover.svg?style=for-the-badge
[forks-url]: https://github.com/rezimaulana/parcelhandover/network/members
[stars-shield]: https://img.shields.io/github/stars/rezimaulana/parcelhandover.svg?style=for-the-badge
[stars-url]: https://github.com/rezimaulana/parcelhandover/stargazers
[issues-shield]: https://img.shields.io/github/issues/rezimaulana/parcelhandover.svg?style=for-the-badge
[issues-url]: https://github.com/rezimaulana/parcelhandover/issues
[license-shield]: https://img.shields.io/github/license/rezimaulana/parcelhandover.svg?style=for-the-badge
[license-url]: https://github.com/rezimaulana/parcelhandover/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/rezimaulana