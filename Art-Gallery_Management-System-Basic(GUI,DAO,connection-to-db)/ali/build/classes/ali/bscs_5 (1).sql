-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2021 at 10:14 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bscs_5`
--

-- --------------------------------------------------------

--
-- Table structure for table `artist`
--

CREATE TABLE `artist` (
  `Artist_ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Style` varchar(20) NOT NULL,
  `Email` text NOT NULL,
  `Country` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `artist`
--

INSERT INTO `artist` (`Artist_ID`, `Name`, `Style`, `Email`, `Country`) VALUES
(1, 'Ali', 'Pop Art', 'abc@gmail.com', 'Pakistan'),
(12, 'd', 'd', 'd', 'sd'),
(23, 'sdf', 'sdf', 'we', 'd'),
(32, 'h', 'gf', 'gf', 'f'),
(420, 'alee', 'st', 'st.ali', 'pk'),
(11111, 'asd', 'asd', 'asd', 'asd');

-- --------------------------------------------------------

--
-- Table structure for table `artwork`
--

CREATE TABLE `artwork` (
  `Art_ID` int(11) NOT NULL,
  `Year` int(11) NOT NULL,
  `Title` text NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `artwork`
--

INSERT INTO `artwork` (`Art_ID`, `Year`, `Title`, `Price`) VALUES
(2, 2001, 'NO one', 1200),
(3, 2, 's', 2);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Description` text NOT NULL,
  `PhoneNo` int(20) NOT NULL,
  `Address` text NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_ID`, `Name`, `Description`, `PhoneNo`, `Address`, `Password`) VALUES
(2, 'd', 'd', 2, 'd', ''),
(3, 'sad', 'sad', 2, 'sad', '2d'),
(11, 'Ahmed', 'fond of art', 300000, 'Rawalpindi', ''),
(29, 'aaa', 'aaa', 0, 'aaa', '333'),
(123, 'asdad', 'asdasd', 123, 'asdsad', ''),
(343, 'asdf', 'asdf', 1234, 'asdf', '343');

-- --------------------------------------------------------

--
-- Table structure for table `exhibition`
--

CREATE TABLE `exhibition` (
  `Exhibition_ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `StartDate` text NOT NULL,
  `EndDate` text NOT NULL,
  `Gallery_Address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exhibition`
--

INSERT INTO `exhibition` (`Exhibition_ID`, `Name`, `StartDate`, `EndDate`, `Gallery_Address`) VALUES
(2, 'as', 'as', 'as', 'as'),
(12, 'Fortress Art Functio', '5th June', '7th June', 'Lahore Art Gallery'),
(433, 'as23', 'as1', 'asd2', 'as2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `artist`
--
ALTER TABLE `artist`
  ADD PRIMARY KEY (`Artist_ID`);

--
-- Indexes for table `artwork`
--
ALTER TABLE `artwork`
  ADD PRIMARY KEY (`Art_ID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_ID`);

--
-- Indexes for table `exhibition`
--
ALTER TABLE `exhibition`
  ADD PRIMARY KEY (`Exhibition_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
