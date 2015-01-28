package Bleach;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.List;

public class Level implements LevelInteractable{

	private List<EntityTranslatable> mobiles;
	private List<EntityTranslatable> loots;
	private List<EntityTranslatable> players;
	private List<EntityTranslatable> projectiles;
	private List<BufferedImage> backgrounds;		// A list of textures that are to be parallaxed in the background.
	private Point2D.Double viewport;				// Offset for scrolling. This points at the middle of the viewport.
	private int width, height;
	private int parallaxDistance;					// How far away the background layers are. Used for the parallaxing of backgrounds.
	private String key;								// Identifier for this level.
	
	public Level(int width, int height, String key){
		this.width = width;
		this.height = height;
		this.key = key;
		parallaxDistance = 10;
	}
	
	@Override
	public List<EntityTranslatable> getMobiles() {
		return mobiles;
	}

	@Override
	public List<EntityTranslatable> getLoots() {
		return loots;
	}

	@Override
	public List<EntityTranslatable> getPlayers() {
		return players;
	}
	
	@Override
	public List<EntityTranslatable> getProjectiles() {
		return projectiles;
	}
	
	public void addMobile(EntityTranslatable mob){
		mobiles.add(mob);
	}
	
	public void addLoot(EntityTranslatable loot){
		loots.add(loot);
	}
	
	public void addPlayer(EntityTranslatable player){
		players.add(player);
	}
	
	public void addProjectile(EntityTranslatable proj){
		projectiles.add(proj);
	}
	
	public void setViewport(Point2D.Double offset){
		viewport = offset;
	}
	
	public Point2D.Double getViewport(){
		return viewport;
	}
	
	public void addBackground(BufferedImage img){
		/* Add a background image to scroll (parallax), add it behind others if some exists already. */
		backgrounds.add(img);
	}
	
	public void clearBackgrounds(){
		/* Removes all backgrounds */
		backgrounds.clear();
	}
	
	public List<BufferedImage> getBackgrounds(){
		return backgrounds;
	}
	
	public int setParallaxDistance(int dist){
		/* Sets the parallax distance. Returns the old distance. */
		int retval = parallaxDistance;
		parallaxDistance = dist;
		
		return retval;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public String getKey(){
		/* Returns the identifier of this level. */
		return key;
	}

}