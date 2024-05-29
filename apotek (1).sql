-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 29 Bulan Mei 2024 pada 04.42
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dataakun`
--

CREATE TABLE `dataakun` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dataakun`
--

INSERT INTO `dataakun` (`username`, `password`) VALUES
('admin', 'admin'),
('1', '1'),
('2', '2'),
('5', '5'),
('plpl', 'plpl'),
('', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dataobat`
--

CREATE TABLE `dataobat` (
  `id` varchar(255) NOT NULL,
  `nama_obat` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL,
  `harga` double NOT NULL,
  `kadaluarsa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dataobat`
--

INSERT INTO `dataobat` (`id`, `nama_obat`, `stock`, `harga`, `kadaluarsa`) VALUES
('K001', 'Amoxcylin', 55556, 2000066, '2 Mei 2006');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dataobat`
--
ALTER TABLE `dataobat`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
