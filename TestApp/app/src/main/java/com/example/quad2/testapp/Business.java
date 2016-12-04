package com.example.quad2.testapp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business {

    @SerializedName("employeeCount")
    @Expose
    private Object employeeCount;
    @SerializedName("updatedAt")
    @Expose
    private long updatedAt;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("features")
    @Expose
    private List<Feature> features = new ArrayList<Feature>();
    @SerializedName("generalInfo")
    @Expose
    private Object generalInfo;
    @SerializedName("placeId")
    @Expose
    private Object placeId;
    @SerializedName("timings")
    @Expose
    private Timings timings;
    @SerializedName("onlinePayment")
    @Expose
    private boolean onlinePayment;
    @SerializedName("businessTypes")
    @Expose
    private List<BusinessType> businessTypes = new ArrayList<BusinessType>();
    @SerializedName("phoneNumbers")
    @Expose
    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
    @SerializedName("premiumSellerInfo")
    @Expose
    private Object premiumSellerInfo;
    @SerializedName("knownFor")
    @Expose
    private List<String> knownFor = new ArrayList<String>();
    @SerializedName("nowfloats")
    @Expose
    private Nowfloats nowfloats;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("paymentMethods")
    @Expose
    private List<Object> paymentMethods = new ArrayList<Object>();
    @SerializedName("registrationDetails")
    @Expose
    private Object registrationDetails;
    @SerializedName("emails")
    @Expose
    private List<Email> emails = new ArrayList<Email>();
    @SerializedName("businessImages")
    @Expose
    private List<Object> businessImages = new ArrayList<Object>();
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("bookingStatus")
    @Expose
    private String bookingStatus;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("premiumSeller")
    @Expose
    private boolean premiumSeller;
    @SerializedName("registeredName")
    @Expose
    private Object registeredName;
    @SerializedName("profileImage")
    @Expose
    private String profileImage;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("coverImage")
    @Expose
    private Object coverImage;
    @SerializedName("socialNetworks")
    @Expose
    private Object socialNetworks;
    @SerializedName("poc")
    @Expose
    private Object poc;
    @SerializedName("subcategories")
    @Expose
    private List<Subcategory> subcategories = new ArrayList<Subcategory>();
    @SerializedName("parentId")
    @Expose
    private Object parentId;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("claimedUser")
    @Expose
    private ClaimedUser claimedUser;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Business() {
    }

    /**
     * 
     * @param location
     * @param generalInfo
     * @param onlinePayment
     * @param nowfloats
     * @param businessTypes
     * @param claimedUser
     * @param id
     * @param timestamp
     * @param parentId
     * @param premiumSeller
     * @param placeId
     * @param knownFor
     * @param description
     * @param premiumSellerInfo
     * @param businessImages
     * @param name
     * @param features
     * @param subcategories
     * @param poc
     * @param coverImage
     * @param profileImage
     * @param status
     * @param website
     * @param timings
     * @param employeeCount
     * @param phoneNumbers
     * @param emails
     * @param updatedAt
     * @param category
     * @param registeredName
     * @param source
     * @param address
     * @param socialNetworks
     * @param paymentMethods
     * @param registrationDetails
     * @param bookingStatus
     */
    public Business(Object employeeCount, long updatedAt, Address address, List<Feature> features, Object generalInfo, Object placeId, Timings timings, boolean onlinePayment, List<BusinessType> businessTypes, List<PhoneNumber> phoneNumbers, Object premiumSellerInfo, List<String> knownFor, Nowfloats nowfloats, String id, List<Object> paymentMethods, Object registrationDetails, List<Email> emails, List<Object> businessImages, String status, long timestamp, String description, String website, String bookingStatus, String name, Category category, boolean premiumSeller, Object registeredName, String profileImage, String location, Object coverImage, Object socialNetworks, Object poc, List<Subcategory> subcategories, Object parentId, String source, ClaimedUser claimedUser) {
        this.employeeCount = employeeCount;
        this.updatedAt = updatedAt;
        this.address = address;
        this.features = features;
        this.generalInfo = generalInfo;
        this.placeId = placeId;
        this.timings = timings;
        this.onlinePayment = onlinePayment;
        this.businessTypes = businessTypes;
        this.phoneNumbers = phoneNumbers;
        this.premiumSellerInfo = premiumSellerInfo;
        this.knownFor = knownFor;
        this.nowfloats = nowfloats;
        this.id = id;
        this.paymentMethods = paymentMethods;
        this.registrationDetails = registrationDetails;
        this.emails = emails;
        this.businessImages = businessImages;
        this.status = status;
        this.timestamp = timestamp;
        this.description = description;
        this.website = website;
        this.bookingStatus = bookingStatus;
        this.name = name;
        this.category = category;
        this.premiumSeller = premiumSeller;
        this.registeredName = registeredName;
        this.profileImage = profileImage;
        this.location = location;
        this.coverImage = coverImage;
        this.socialNetworks = socialNetworks;
        this.poc = poc;
        this.subcategories = subcategories;
        this.parentId = parentId;
        this.source = source;
        this.claimedUser = claimedUser;
    }

    /**
     * 
     * @return
     *     The employeeCount
     */
    public Object getEmployeeCount() {
        return employeeCount;
    }

    /**
     * 
     * @param employeeCount
     *     The employeeCount
     */
    public void setEmployeeCount(Object employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Business withEmployeeCount(Object employeeCount) {
        this.employeeCount = employeeCount;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updatedAt
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Business withUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public Business withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The features
     */
    public List<Feature> getFeatures() {
        return features;
    }

    /**
     * 
     * @param features
     *     The features
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Business withFeatures(List<Feature> features) {
        this.features = features;
        return this;
    }

    /**
     * 
     * @return
     *     The generalInfo
     */
    public Object getGeneralInfo() {
        return generalInfo;
    }

    /**
     * 
     * @param generalInfo
     *     The generalInfo
     */
    public void setGeneralInfo(Object generalInfo) {
        this.generalInfo = generalInfo;
    }

    public Business withGeneralInfo(Object generalInfo) {
        this.generalInfo = generalInfo;
        return this;
    }

    /**
     * 
     * @return
     *     The placeId
     */
    public Object getPlaceId() {
        return placeId;
    }

    /**
     * 
     * @param placeId
     *     The placeId
     */
    public void setPlaceId(Object placeId) {
        this.placeId = placeId;
    }

    public Business withPlaceId(Object placeId) {
        this.placeId = placeId;
        return this;
    }

    /**
     * 
     * @return
     *     The timings
     */
    public Timings getTimings() {
        return timings;
    }

    /**
     * 
     * @param timings
     *     The timings
     */
    public void setTimings(Timings timings) {
        this.timings = timings;
    }

    public Business withTimings(Timings timings) {
        this.timings = timings;
        return this;
    }

    /**
     * 
     * @return
     *     The onlinePayment
     */
    public boolean isOnlinePayment() {
        return onlinePayment;
    }

    /**
     * 
     * @param onlinePayment
     *     The onlinePayment
     */
    public void setOnlinePayment(boolean onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public Business withOnlinePayment(boolean onlinePayment) {
        this.onlinePayment = onlinePayment;
        return this;
    }

    /**
     * 
     * @return
     *     The businessTypes
     */
    public List<BusinessType> getBusinessTypes() {
        return businessTypes;
    }

    /**
     * 
     * @param businessTypes
     *     The businessTypes
     */
    public void setBusinessTypes(List<BusinessType> businessTypes) {
        this.businessTypes = businessTypes;
    }

    public Business withBusinessTypes(List<BusinessType> businessTypes) {
        this.businessTypes = businessTypes;
        return this;
    }

    /**
     * 
     * @return
     *     The phoneNumbers
     */
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * 
     * @param phoneNumbers
     *     The phoneNumbers
     */
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Business withPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * 
     * @return
     *     The premiumSellerInfo
     */
    public Object getPremiumSellerInfo() {
        return premiumSellerInfo;
    }

    /**
     * 
     * @param premiumSellerInfo
     *     The premiumSellerInfo
     */
    public void setPremiumSellerInfo(Object premiumSellerInfo) {
        this.premiumSellerInfo = premiumSellerInfo;
    }

    public Business withPremiumSellerInfo(Object premiumSellerInfo) {
        this.premiumSellerInfo = premiumSellerInfo;
        return this;
    }

    /**
     * 
     * @return
     *     The knownFor
     */
    public List<String> getKnownFor() {
        return knownFor;
    }

    /**
     * 
     * @param knownFor
     *     The knownFor
     */
    public void setKnownFor(List<String> knownFor) {
        this.knownFor = knownFor;
    }

    public Business withKnownFor(List<String> knownFor) {
        this.knownFor = knownFor;
        return this;
    }

    /**
     * 
     * @return
     *     The nowfloats
     */
    public Nowfloats getNowfloats() {
        return nowfloats;
    }

    /**
     * 
     * @param nowfloats
     *     The nowfloats
     */
    public void setNowfloats(Nowfloats nowfloats) {
        this.nowfloats = nowfloats;
    }

    public Business withNowfloats(Nowfloats nowfloats) {
        this.nowfloats = nowfloats;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Business withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The paymentMethods
     */
    public List<Object> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * 
     * @param paymentMethods
     *     The paymentMethods
     */
    public void setPaymentMethods(List<Object> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Business withPaymentMethods(List<Object> paymentMethods) {
        this.paymentMethods = paymentMethods;
        return this;
    }

    /**
     * 
     * @return
     *     The registrationDetails
     */
    public Object getRegistrationDetails() {
        return registrationDetails;
    }

    /**
     * 
     * @param registrationDetails
     *     The registrationDetails
     */
    public void setRegistrationDetails(Object registrationDetails) {
        this.registrationDetails = registrationDetails;
    }

    public Business withRegistrationDetails(Object registrationDetails) {
        this.registrationDetails = registrationDetails;
        return this;
    }

    /**
     * 
     * @return
     *     The emails
     */
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * 
     * @param emails
     *     The emails
     */
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Business withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * 
     * @return
     *     The businessImages
     */
    public List<Object> getBusinessImages() {
        return businessImages;
    }

    /**
     * 
     * @param businessImages
     *     The businessImages
     */
    public void setBusinessImages(List<Object> businessImages) {
        this.businessImages = businessImages;
    }

    public Business withBusinessImages(List<Object> businessImages) {
        this.businessImages = businessImages;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Business withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Business withTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Business withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    public Business withWebsite(String website) {
        this.website = website;
        return this;
    }

    /**
     * 
     * @return
     *     The bookingStatus
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * 
     * @param bookingStatus
     *     The bookingStatus
     */
    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Business withBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Business withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    public Business withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * 
     * @return
     *     The premiumSeller
     */
    public boolean isPremiumSeller() {
        return premiumSeller;
    }

    /**
     * 
     * @param premiumSeller
     *     The premiumSeller
     */
    public void setPremiumSeller(boolean premiumSeller) {
        this.premiumSeller = premiumSeller;
    }

    public Business withPremiumSeller(boolean premiumSeller) {
        this.premiumSeller = premiumSeller;
        return this;
    }

    /**
     * 
     * @return
     *     The registeredName
     */
    public Object getRegisteredName() {
        return registeredName;
    }

    /**
     * 
     * @param registeredName
     *     The registeredName
     */
    public void setRegisteredName(Object registeredName) {
        this.registeredName = registeredName;
    }

    public Business withRegisteredName(Object registeredName) {
        this.registeredName = registeredName;
        return this;
    }

    /**
     * 
     * @return
     *     The profileImage
     */
    public String getProfileImage() {
        return profileImage;
    }

    /**
     * 
     * @param profileImage
     *     The profileImage
     */
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Business withProfileImage(String profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public Business withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The coverImage
     */
    public Object getCoverImage() {
        return coverImage;
    }

    /**
     * 
     * @param coverImage
     *     The coverImage
     */
    public void setCoverImage(Object coverImage) {
        this.coverImage = coverImage;
    }

    public Business withCoverImage(Object coverImage) {
        this.coverImage = coverImage;
        return this;
    }

    /**
     * 
     * @return
     *     The socialNetworks
     */
    public Object getSocialNetworks() {
        return socialNetworks;
    }

    /**
     * 
     * @param socialNetworks
     *     The socialNetworks
     */
    public void setSocialNetworks(Object socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public Business withSocialNetworks(Object socialNetworks) {
        this.socialNetworks = socialNetworks;
        return this;
    }

    /**
     * 
     * @return
     *     The poc
     */
    public Object getPoc() {
        return poc;
    }

    /**
     * 
     * @param poc
     *     The poc
     */
    public void setPoc(Object poc) {
        this.poc = poc;
    }

    public Business withPoc(Object poc) {
        this.poc = poc;
        return this;
    }

    /**
     * 
     * @return
     *     The subcategories
     */
    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    /**
     * 
     * @param subcategories
     *     The subcategories
     */
    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }

    public Business withSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
        return this;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public Object getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parentId
     */
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Business withParentId(Object parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    public Business withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 
     * @return
     *     The claimedUser
     */
    public ClaimedUser getClaimedUser() {
        return claimedUser;
    }

    /**
     * 
     * @param claimedUser
     *     The claimedUser
     */
    public void setClaimedUser(ClaimedUser claimedUser) {
        this.claimedUser = claimedUser;
    }

    public Business withClaimedUser(ClaimedUser claimedUser) {
        this.claimedUser = claimedUser;
        return this;
    }

    @Override
    public String toString() {
        return "Business{" +
                "employeeCount=" + employeeCount +
                ", updatedAt=" + updatedAt +
                ", address=" + address +
                ", features=" + features +
                ", generalInfo=" + generalInfo +
                ", placeId=" + placeId +
                ", timings=" + timings +
                ", onlinePayment=" + onlinePayment +
                ", businessTypes=" + businessTypes +
                ", phoneNumbers=" + phoneNumbers +
                ", premiumSellerInfo=" + premiumSellerInfo +
                ", knownFor=" + knownFor +
                ", nowfloats=" + nowfloats +
                ", id='" + id + '\'' +
                ", paymentMethods=" + paymentMethods +
                ", registrationDetails=" + registrationDetails +
                ", emails=" + emails +
                ", businessImages=" + businessImages +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                ", description='" + description + '\'' +
                ", website='" + website + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", premiumSeller=" + premiumSeller +
                ", registeredName=" + registeredName +
                ", profileImage='" + profileImage + '\'' +
                ", location='" + location + '\'' +
                ", coverImage=" + coverImage +
                ", socialNetworks=" + socialNetworks +
                ", poc=" + poc +
                ", subcategories=" + subcategories +
                ", parentId=" + parentId +
                ", source='" + source + '\'' +
                ", claimedUser=" + claimedUser +
                '}';
    }
}
