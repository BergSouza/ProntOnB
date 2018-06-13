-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Jun-2018 às 05:50
-- Versão do servidor: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pluslife`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administradores`
--

CREATE TABLE `administradores` (
  `id_admin` int(10) NOT NULL,
  `identity` varchar(50) NOT NULL,
  `nome_admin` varchar(50) NOT NULL,
  `senha_admin` varchar(50) NOT NULL,
  `email_admin` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `administradores`
--

INSERT INTO `administradores` (`id_admin`, `identity`, `nome_admin`, `senha_admin`, `email_admin`) VALUES
(1, 'root', 'root', 'root', 'root@root');

-- --------------------------------------------------------

--
-- Estrutura da tabela `convenios`
--

CREATE TABLE `convenios` (
  `id_convenio` int(5) NOT NULL,
  `nome_convenio` varchar(50) NOT NULL,
  `endereco_convenio` varchar(80) NOT NULL,
  `telefone_convenio` varchar(14) NOT NULL,
  `cnpj_convenio` int(14) NOT NULL,
  `plano_convenio` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `convenios`
--

INSERT INTO `convenios` (`id_convenio`, `nome_convenio`, `endereco_convenio`, `telefone_convenio`, `cnpj_convenio`, `plano_convenio`) VALUES
(1, 'Convênio ABC', 'Rua ABC', '999999999', 15115, 5),
(2, 'Convênio DEF', 'teste1', '213123', 12321, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `medicos`
--

CREATE TABLE `medicos` (
  `id_medico` int(5) NOT NULL,
  `identity` varchar(50) NOT NULL,
  `nome_medico` varchar(80) NOT NULL,
  `cpf_medico` int(11) NOT NULL,
  `rg_medico` varchar(20) NOT NULL,
  `crm_medico` int(10) NOT NULL,
  `telefone_medico` varchar(14) NOT NULL,
  `endereco_medico` varchar(100) NOT NULL,
  `sexo_medico` varchar(1) NOT NULL,
  `senha_medico` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `medicos`
--

INSERT INTO `medicos` (`id_medico`, `identity`, `nome_medico`, `cpf_medico`, `rg_medico`, `crm_medico`, `telefone_medico`, `endereco_medico`, `sexo_medico`, `senha_medico`) VALUES
(3, 'med1', 'Rodowisk Robson', 2424, '2424', 24, '2424', 'Asd', 'M', '123'),
(4, 'med2', 'Rodolfo', 12, '12', 12, '12', 'asd', 'M', '12');

-- --------------------------------------------------------

--
-- Estrutura da tabela `secs`
--

CREATE TABLE `secs` (
  `id_sec` int(5) NOT NULL,
  `identity` varchar(50) NOT NULL,
  `nome_sec` varchar(80) NOT NULL,
  `cpf_sec` int(11) NOT NULL,
  `rg_sec` varchar(20) NOT NULL,
  `telefone_sec` varchar(14) NOT NULL,
  `endereco_sec` varchar(100) NOT NULL,
  `sexo_sec` varchar(1) NOT NULL,
  `senha_sec` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `secs`
--

INSERT INTO `secs` (`id_sec`, `identity`, `nome_sec`, `cpf_sec`, `rg_sec`, `telefone_sec`, `endereco_sec`, `sexo_sec`, `senha_sec`) VALUES
(1, 'sec1', 'Secretária Joana', 998788, '4847', '4949494', 'Indefinido', 'M', 'joana123'),
(2, 'sec2', 'Secretária Júlia', 99888, '4848', '4949495', 'Indefinido', 'F', 'sec123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `teste`
--

CREATE TABLE `teste` (
  `teste` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `teste`
--

INSERT INTO `teste` (`teste`) VALUES
('teste'),
('Bergson');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `convenios`
--
ALTER TABLE `convenios`
  ADD PRIMARY KEY (`id_convenio`);

--
-- Indexes for table `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`id_medico`);

--
-- Indexes for table `secs`
--
ALTER TABLE `secs`
  ADD PRIMARY KEY (`id_sec`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administradores`
--
ALTER TABLE `administradores`
  MODIFY `id_admin` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `convenios`
--
ALTER TABLE `convenios`
  MODIFY `id_convenio` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `medicos`
--
ALTER TABLE `medicos`
  MODIFY `id_medico` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `secs`
--
ALTER TABLE `secs`
  MODIFY `id_sec` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
