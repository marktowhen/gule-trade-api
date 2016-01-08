CREATE TABLE `message` (
  `id` varchar(22) NOT NULL,
  `sent_uid` varchar(22) DEFAULT NULL,
  `receive_uid` varchar(22) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` text NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `status` int(2) DEFAULT NULL COMMENT '状态 1:成功 2:失败 3:删除',
  `addtime` datetime DEFAULT NULL,
  `addip` varchar(15) DEFAULT NULL,
  `has_read` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `pk_message_id` (`id`) USING HASH,
  KEY `index_message_ruid` (`receive_uid`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='消息';

