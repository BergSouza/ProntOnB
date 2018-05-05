-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05-Maio-2018 às 06:10
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
(2, 'Teste1', 'teste1', '213123', 12321, 2);

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
(1, '', 'Rodolfo', 242424, '242424', 2424, '924242424', 'numero 24', 'M', '123'),
(2, '', 'Rodolfo Gay', 24242, '242424', 24, '924242424', 'rua viadagem 24', 'F', '12345');

-- --------------------------------------------------------

--
-- Estrutura da tabela `secretarias`
--

CREATE TABLE `secretarias` (
  `id_secretaria` int(5) NOT NULL,
  `identity` varchar(50) NOT NULL,
  `nome_secretaria` varchar(80) NOT NULL,
  `cpf_secretaria` int(11) NOT NULL,
  `rg_secretaria` varchar(20) NOT NULL,
  `telefone_secretaria` varchar(14) NOT NULL,
  `endereco_secretaria` varchar(100) NOT NULL,
  `sexo_secretaria` varchar(1) NOT NULL,
  `senha_secretaria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
-- Indexes for table `secretarias`
--
ALTER TABLE `secretarias`
  ADD PRIMARY KEY (`id_secretaria`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administradores`
--
ALTER TABLE `administradores`
  MODIFY `id_admin` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `convenios`
--
ALTER TABLE `convenios`
  MODIFY `id_convenio` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `medicos`
--
ALTER TABLE `medicos`
  MODIFY `id_medico` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `secretarias`
--
ALTER TABLE `secretarias`
  MODIFY `id_secretaria` int(5) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
