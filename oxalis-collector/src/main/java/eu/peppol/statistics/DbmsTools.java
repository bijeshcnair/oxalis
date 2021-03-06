package eu.peppol.statistics;

/**
 * @author steinar
 *         Date: 03.04.13
 *         Time: 21:29
 */
class DbmsTools {


    void createDatabaseSchema() {
        StatisticsRepositoryFactory statisticsRepositoryFactory = StatisticsRepositoryFactoryProvider.getInstance();

        AggregatedStatisticsRepository aggregatedStatisticsRepository = statisticsRepositoryFactory.getInstanceForAggregatedStatistics();
        aggregatedStatisticsRepository.createDatabaseSchemaForDataWarehouse();
    }
}

