-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2024 at 07:23 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cis`
--

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `departments`
--

INSERT INTO `departments` (`id`, `name`) VALUES
(1, 'IT'),
(2, 'HR'),
(3, 'Accounts'),
(4, 'Logistics'),
(6, 'Marketing');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `fName` varchar(50) NOT NULL,
  `lName` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `tel` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `depId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `fName`, `lName`, `address`, `tel`, `email`, `depId`) VALUES
(1, 'Janith', 'Perera', 'Homagama', 773351031, 'janith@gmail.com', 1),
(2, 'Malith', 'Perera', 'Kottawa', 773344554, 'malith@gmail.com', 2),
(8, 'Nadun', 'Perera', 'Kottawa', 77335533, 'nadun@gmail.com', 2),
(10, 'Ravindu', 'Silva', 'Kosgama', 774433223, 'ravindu@gmail.com', 2),
(11, 'Sadun', 'Silva', '4', 71222222, 'sandun@gmail.com', 4),
(12, 'Rayan', 'Jaksa', 'Negombo', 772277, 'jaksa@gmail.com', 1),
(13, 'Shakini', 'Lesley', 'Negombo', 77333777, 'shakini@gmail.com', 6),
(15, 'Buddi', 'Perera', 'Rajagiriya', 7722222, 'buddi@gmail.com', 4),
(23, 'Shilpa', 'Fernando', 'Chilaw', 119, 'nipunshilpa@gmail.com', 2);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(64) NOT NULL,
  `role` varchar(50) NOT NULL,
  `empId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `userName`, `password`, `role`, `empId`) VALUES
(1, 'Janith', '07cc3022ae8c1af99606e1c773dba47169f5987bf82f08fc8225cc14d2a06b20', 'Admin', 1),
(2, 'Malith', '4b9b90013bb0c99e0824ef43138923964886cc4659f100b22734bdc941e5a3a4', 'HR Manager', 2),
(6, 'Nadun', '1b776972df198d8c0bb78c09b124c336726ee916d3fbcde9468b8fc9de50a793', 'HR Assistant', 8),
(7, 'Ravindu', '8e5af846b1c4a77084b330fac00b20ab7d89e9fd94705c18d688a80095cd5b30', 'HR Manager', 10),
(9, 'Rayan', 'e2f5ab0d9cf0057b7a18086c9062892e4088ec6235b6a22a701f52e7dbd99df1', 'Admin', 12),
(10, 'Shilpa', 'f046fd5bc1e612ee8b5dd20837f2759a20f058f81f599a010add733001c29b62', 'HR Manager', 23);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`),
  ADD KEY `depId` (`depId`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD KEY `empId` (`empId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `departments`
--
ALTER TABLE `departments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`depId`) REFERENCES `departments` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`empId`) REFERENCES `employees` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
