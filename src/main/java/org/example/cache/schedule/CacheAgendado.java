package org.example.cache.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class CacheAgendado {

    private final static Logger logger = LoggerFactory.getLogger(CacheAgendado.class);

    @Scheduled(fixedDelay = 30, timeUnit = TimeUnit.MINUTES)
    @CacheEvict("empresas")
    public void cleanCacheEmpresa() {
        logger.info("Limpeza de cache executado: " + LocalDateTime.now());
    }
}
