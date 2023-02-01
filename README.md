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
    Parcel handover from one driver to another in the warehouse.
    <br />
    <a href="https://github.com/rezimaulana/parcelhandover"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/rezimaulana/parcelhandover">View Demo</a>
    ·
    <a href="https://github.com/rezimaulana/parcelhandover/issues">Report Bug</a>
    ·
    <a href="https://github.com/rezimaulana/parcelhandover/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li>
      <a href="#getting-started">Getting Started</a>
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
## About The Project

<p>Projek ini memiliki tujuan untuk membuat sistem yang dapat memantau dan mencatat secara akurat jumlah barang masuk dan keluar pada gudang logistik.</p>
<p>Sistem ini akan mengumpulkan data yang akan digunakan untuk tiga hal utama:<br> 
1. Melacak kehadiran driver gudang, meliputi waktu kedatangan dan waktu keberangkatan<br>
2. Analisis jumlah paket masuk dan keluar pada gudang<br>
3. Menilai performa sorting berdasarkan tujuan</p>
<p>Informasi ini biasanya dicatat secara manual melalui Excel atau melalui query database yang rumit, dan sulit didapatkan terutama pada industri ekspedisi.</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* npm
  ```sh
  npm install npm@latest -g
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