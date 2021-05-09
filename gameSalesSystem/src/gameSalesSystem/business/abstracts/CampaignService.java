package gameSalesSystem.business.abstracts;

import gameSalesSystem.entity.concrete.Campaign;

public interface CampaignService {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
