package sx.blah.discord.api.internal.json.responses;

/**
 * The generic invite json response
 */
public class InviteJSONResponse {

	/**
	 * The invite code
	 */
	public String code;

	/**
	 * The guild the invite leads to
	 */
	public GuildResponse guild;

	/**
	 * The channel the invite leads to
	 */
	public ChannelResponse channel;

	/**
	 * The guild object from the invite
	 */
	public static class GuildResponse {

		/**
		 * Only available for discord partners
		 */
		public String splash_hash;

		/**
		 * The guild id
		 */
		public String id;

		/**
		 * The guild name
		 */
		public String name;
	}

	/**
	 * The channel object from the invite
	 */
	public static class ChannelResponse {

		/**
		 * The channel type, either "text" or "voice"
		 */
		public String type;
		/**
		 * The channel id
		 */
		public String id;
		/**
		 * The channel name
		 */
		public String name;
	}
}
