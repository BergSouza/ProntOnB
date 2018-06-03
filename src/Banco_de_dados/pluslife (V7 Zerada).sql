-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Jun-2018 às 01:15
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
-- Estrutura da tabela `consultas`
--

CREATE TABLE `consultas` (
  `id_consulta` int(5) NOT NULL,
  `nome_paciente` varchar(50) NOT NULL,
  `id_medico` int(3) NOT NULL,
  `nome_medico` varchar(50) NOT NULL,
  `rg_paciente` varchar(20) NOT NULL,
  `data_nasc_paciente` varchar(10) NOT NULL,
  `sexo_paciente` varchar(1) NOT NULL,
  `data_consulta` varchar(10) NOT NULL,
  `hora_consulta` varchar(2) NOT NULL,
  `minuto_consulta` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `consultas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `consultas_r`
--

CREATE TABLE `consultas_r` (
  `id_consulta` int(5) NOT NULL,
  `nome_paciente` varchar(50) NOT NULL,
  `id_medico` int(3) NOT NULL,
  `nome_medico` varchar(50) NOT NULL,
  `rg_paciente` varchar(20) NOT NULL,
  `data_nasc_paciente` varchar(10) NOT NULL,
  `sexo_paciente` varchar(1) NOT NULL,
  `data_consulta` varchar(10) NOT NULL,
  `hora_consulta` varchar(52) NOT NULL,
  `minuto_consulta` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `consultas_r`
--
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

-- --------------------------------------------------------

--
-- Estrutura da tabela `medicos`
--

CREATE TABLE `medicos` (
  `id_medico` int(5) NOT NULL,
  `identity` varchar(50) NOT NULL,
  `nome_medico` varchar(80) NOT NULL,
  `cpf_medico` varchar(11) NOT NULL,
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

-- --------------------------------------------------------

--
-- Estrutura da tabela `secs`
--

CREATE TABLE `secs` (
  `id_sec` int(5) NOT NULL,
  `identity` varchar(50) NOT NULL,
  `nome_sec` varchar(80) NOT NULL,
  `cpf_sec` varchar(11) NOT NULL,
  `rg_sec` varchar(20) NOT NULL,
  `telefone_sec` varchar(14) NOT NULL,
  `endereco_sec` varchar(100) NOT NULL,
  `sexo_sec` varchar(1) NOT NULL,
  `senha_sec` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `secs`
--

-- Indexes for dumped tables
--

--
-- Indexes for table `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `consultas`
--
ALTER TABLE `consultas`
  ADD PRIMARY KEY (`id_consulta`);

--
-- Indexes for table `consultas_r`
--
ALTER TABLE `consultas_r`
  ADD PRIMARY KEY (`id_consulta`);

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
  MODIFY `id_admin` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `consultas`
--
ALTER TABLE `consultas`
  MODIFY `id_consulta` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `consultas_r`
--
ALTER TABLE `consultas_r`
  MODIFY `id_consulta` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `convenios`
--
ALTER TABLE `convenios`
  MODIFY `id_convenio` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `medicos`
--
ALTER TABLE `medicos`
  MODIFY `id_medico` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `secs`
--
ALTER TABLE `secs`
  MODIFY `id_sec` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
